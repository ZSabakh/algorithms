package com.company.hashTable;

public class HashTable{
    private StoredEmployee[] hashTable;

    public HashTable(){
        hashTable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if(occupied(hashedKey)){
//          Linear probing, collusion still possible
            int stopIndex = hashedKey;

//          Wrapping
            if(hashedKey == hashTable.length - 1){
                hashedKey = 0;
            }else{
                hashedKey++;
            }
            while(occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }

        if(occupied(hashedKey)){
            System.out.println("Collision @" + hashedKey + " not handled :(");
        }
        else{
            hashTable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }
        return hashTable[hashedKey].employee;
    }

    public Employee remove(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }

        Employee employee = hashTable[hashedKey].employee;
        hashTable[hashedKey] = null;

        StoredEmployee[] oldHashTable = hashTable;
        hashTable = new StoredEmployee[oldHashTable.length];
        for(int i = 0; i < oldHashTable.length; i++){
            if(oldHashTable[i] != null){
                put(oldHashTable[i].key, oldHashTable[i].employee);
            }
        }

        return employee;
    }

    public void printTable(){
        for(int i = 0; i < hashTable.length; i++){
            if(hashTable[i] == null){
                System.out.println("Empty");
            }else{
                System.out.println(hashTable[i].employee);
            }
        }
    }

    private int findKey(String key){
        int hashedKey = hashKey(key);
        if(hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)){
            return hashedKey;
        }

        int stopIndex = hashedKey;

        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stopIndex && hashTable[hashedKey] != null && !hashTable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }

        if(hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        else{
            return -1;
        }
    }

    private int hashKey(String key){
        int charASCIISum = 0;
        for(int i = 0; i < key.length(); i++){
            charASCIISum += key.charAt(i);
        }
        return charASCIISum % hashTable.length;
    }

    private boolean occupied(int index){
        return hashTable[index] != null;
    }
}
