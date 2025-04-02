/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deque;

/**
 *
 * @author rowele
 */
public class Deque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DequeArray a = new DequeArray(5);
        a.add_front(0);
        a.add_rear(27);
        a.add_front(2);
        System.out.println(a.remove_front());
        System.out.println(a.get_front());
        System.out.println(a.size());
        System.out.println(a.remove_rear());
        a.add_front(10);
        a.add_front(200);
        a.add_front(300);
        System.out.println(a.peek_nth(3));
        a.rotate(1);
        a.peek_nth(0);
        System.out.println(a.get_rear());
        System.out.println(a.get_front());
        a.clear();
        System.out.println(a.get_front());
    }
}
