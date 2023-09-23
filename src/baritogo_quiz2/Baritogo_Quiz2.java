/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baritogo_quiz2;

import java.util.Scanner;
/**
 *
 * @author Tovi Myer
 */
public class Baritogo_Quiz2 {
    public static void main(String[] args) {       
        menu();      
    }  
    public static void menu(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Choose a number Between?\n1\n2");
        int input = scn.nextInt();        
        if (input == 1){
            numberone();
        } else if (input == 2){
            numbertwo();
        } else{
            System.out.println("Pasagad rakag type!");
            menu();
        }
    }
    public static void numberone(){
    class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public boolean search(int target) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
        Scanner scn = new Scanner(System.in);
        LinkedList myList = new LinkedList();
        myList.append(1);
        myList.append(2);
        myList.append(3);
        System.out.println("What number do you want to find?");
        int input = scn.nextInt();
        int elementToFind = input;
       
        if (myList.search(elementToFind)) {
            System.out.println(elementToFind + " found in the list");
        } else {
            System.out.println(elementToFind + " not found in the list");           
        }
        menu();        
    }    
    public static void numbertwo(){         
    class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head; 
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1 || head == null) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 1; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Invalid position. Inserting at the end.");
                insertAtEnd(data);
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
        LinkedList myList = new LinkedList();
        Scanner scanner = new Scanner(System.in); 
        while (true) {
            System.out.print("Enter data to insert\n0 to Exit: ");
            int data = scanner.nextInt();
            if (data == 0) {
                menu();
            }
            System.out.print("What position do you desire? ");
            int position = scanner.nextInt();
            myList.insertAtPosition(data, position);
            myList.display();
        }     
    }
}
