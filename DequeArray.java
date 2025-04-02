/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deque;

/**
 *
 * @author rowele
 */
public class DequeArray {
    final int[] arr;
    private int front;
    private int rear;
    private int size;
    final int capacity;
    public DequeArray(){
        arr = new int[5];
        size = 0;
        front = 0;
        rear = -1;
        capacity = 3;
    }
    public DequeArray(int num){ 
        arr = new int[num];
        size = 0;
        front = 0;
        rear = -1;
        capacity = num;
    }
    public boolean is_empty(){
        return size == 0;
    //checks if size is zero which means the deque is empty
    //0(1)
    }
    public boolean is_full(){
        return size == capacity;
    //checks if the size of the array is at capacity which means the deque is full
    //0(1)
    }
    public void add_front(int item){
        if(is_full()){
            System.out.println("Full");
        //does not add element if deque is full
        }
        else if(is_empty()){
            front = capacity-1;
            arr[front]=item;
            size++;
        //adds element to the front if the deque is empty and moves the front to the end of the array
        }
        else if(!is_full()){
            arr[--front]=item;
            size++;
        //adds element to the front by decrementing the front moving the front forward
        //0(1) to add front
        }
        
    }
    public void add_rear(int item){
        if(is_full()){
            System.out.println("Full");
        //does not add element to the rear if the deque is full
        }
        else if(rear == capacity-1){
            rear = 0;
        arr[rear]= item;
        size++;
        //checks if the rear is at the end of the array and brings it to the front of the array
        }
        else if(!is_full()){
        arr[++rear]=item;
        size++;
        //adds element to the rear
        //0(1) to add rear
        }
    }
    public int remove_front(){
        int temp = arr[front];
        //stores value of front
        if(is_empty()){
            System.out.println("Empty");
        return -1;
        }
        if(front == capacity){
            arr[front]=0;
            front = 0;
        }
        //checks if front is at the capacity and brings it to the front
        else{
            arr[front]=0;
            front++;
            }
        //increments front
        size--;//one less item
        return temp;
        //returns value at the front
        //0(1) to remove front
    }
    public int remove_rear(){
       int temp = arr[rear];
       if(is_empty()){
           System.out.println("Empty");
           return -1;
       }
       if(!is_empty() && rear == 0){
            arr[rear]=0;
            rear = capacity-1;
       //if rear is at the front it brings it to the back of the array
       }
       else {
           arr[rear]=0;
           rear--;
       }
       //decrements the rear if it is not at the front
        size--;//one less item
        return temp;
        //0(1) to remove rear
       }
    public int get_front(){
        if(is_empty()){
            System.out.println("Empty");
        return -1;
        //returns -1 if empty
        }
        else
        return arr[front];
        //returns value at front
        //0(1) to get front
    }
    public int get_rear(){
        if(is_empty()){
            return -1;
        //returns -1 if empty
        }
        else
        return arr[rear];
        //returns value at rear
        //0(1) to get rear
    }
    public int size(){
        return size;
    //returns size
    //0(1) to get size
    }
    public void clear(){
    if(is_empty())
            System.out.println("Clear");
    else{
        for(int i = 1; i < capacity-1; i++){
            arr[i]=0;
        //for loop makes all element equal to 0
        }
        size = 0;
        front = 0;
        rear = -1;
        //resets the size, front, and rear
        System.out.println("Cleared");
    }
    //0(n) to clear all because it goes through all n items in array
    }
    public void rotate(int k){
    int num = k % capacity;
    front = (front + num + capacity) % capacity;
    rear = (rear + num + capacity) % capacity;
    //0(1) to rotate
    }
    public int peek_nth(int n){
        int num = (front + n)% capacity-1;
        return arr[num];
    //0(1) to peek nth
    }
}
