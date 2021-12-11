package com.company.hashTable;

public class HashTable{
    private Employee[] hashTable;

    public HashTable(){
        hashTable = new Employee[10];
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if(hashTable[hashedKey] != null){
            System.out.println("Collision @" + hashedKey + " not handled :(");
        }
        else{
            hashTable[hashedKey] = employee;
        }
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashTable[hashedKey];
    }

    public void printTable(){
        for(int i = 0; i < hashTable.length; i++){
            System.out.println(hashTable[i]);
        }
    }

    private int hashKey(String key){
        int charASCIISum = 0;
        for(int i = 0; i < key.length(); i++){
            charASCIISum += key.charAt(i);
        }
        return charASCIISum % hashTable.length;
    }
}
