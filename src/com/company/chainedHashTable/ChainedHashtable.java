package com.company.chainedHashTable;
import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {
    private LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashtable(){
        hashTable = new LinkedList[10];
        for(int i=0; i < hashTable.length; i++){
            hashTable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        hashTable[hashedKey].add(new StoredEmployee(key, employee));

    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee employee = null;
        while(iterator.hasNext()){
            employee = iterator.next();
            if(employee.key.equals(key)){
                return employee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee employee = null;
        int index = -1;
        while(iterator.hasNext()){
            employee = iterator.next();
            index++;
            if(employee.key.equals(key)){
                break;
            }
        }

        if(employee == null){
            return null;
        }
        hashTable[hashedKey].remove(index);
        return employee.employee;
    }

    private int hashKey(String key){
        return Math.abs(key.hashCode() % hashTable.length);
    }

    public void printHashTable(){
        for(int i = 0; i < hashTable.length; i++){
            if(hashTable[i].isEmpty()){
                System.out.println(i + " is empty");
            }else{
                ListIterator<StoredEmployee> iterator = hashTable[i].listIterator();
                System.out.print(i + " pos:");
                while(iterator.hasNext()){
                    System.out.print(iterator.next().employee);
                    System.out.print("->");
                }
            }
        }

    }

}