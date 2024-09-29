package com.example.project;

public class QueueStackTester {
    public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
        Queue<T> w = q;

        int k = 1 ; 
        while(q.length()!=0){
            if(k%2!=0){
                oq.enqueue(w.serve());
            }
            else if (k%2==0) {
                eq.enqueue(w.serve());
            }
            k++;
        }

        // Write the recursive static method split that splits a queue of n elements into two
        // queues. The elements with odd orders (i.e. 1st, 3rd, 5th ...) should be put in the
        // first queue and elements with even orders (i.e. 2nd, 4th, 6th ...) should be put in
        // the second queue. The original queue should remain unchanged at the end of the
        // method.
        // Example. Given the queue (A, B, C, D, E), split results in oq (A, C, E), and eq(B, D).
    }
    public static <T> void remove(LinkedPQ<T> pq, int p)

    {   
        LinkedPQ<T> pq2 = pq;
        for(int i = 0 ; i<pq.length();i++){
        if(pq.serve().p>p){
            pq2.enqueue(pq.serve().data,pq.serve().p);
            pq.serve();
        }
        else pq.serve();

    }
    pq=pq2;

        // Write a static method remove that removes every element in the priority queue
        // having priority less than p.
        // Example. Given pq: [A, 10], [D, 8], [B, 5], [E, 3], [C, 2] remove(pq, 5) results in
        // pq: [A, 10], [D, 8], [B, 5].
    }
    public static <T> boolean search(Stack<T> st, T e)
    {
        Stack<T> st1 = st;
        if(st.empty()){
            return false;
        }
        if(st1.pop()==e){
            return true;
        }

        st1.pop();
        search(st1, e);

        return false;
        // Write the recursive static method search that searches for an element e in a stack st
        // and returns true if it’s found or false otherwise. st should not change at the end of
        // the method. You are not allowed to use any auxiliary data structures.
        // Example. Given the stack st (top-to-bottom): 5, 7, 5, 3, 2. search(st, 3) returns
        // true while search(st, 1) returns false.
    }
}