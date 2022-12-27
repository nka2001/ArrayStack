package com.mycompany.arraystack;

/**
 *
 * @author nicka
 */
public class ArrayStackDS {

    int[] a;//backing array
    int n;//number of elements in the backing array

    /**
     * default constructor, sets initial array size to 10, and the number of
     * elements to 0.
     */
    public ArrayStackDS() {
        this.a = new int[10];//intial size of array will be 10 with default constructor
        this.n = 0;//number of elements is set to 0
    }

    /**
     * constructor with default parameter, accepts the array size as a parameter
     *
     * @param arrSize
     */
    public ArrayStackDS(int arrSize) {
        this.a = new int[arrSize];//backing array is initialized to the size provided
        this.n = 0;//number of elements is set to 0

    }

    /**
     * constructor with default parameters, takes an array and the number of
     * elements as parameters
     *
     * @param arr
     * @param n
     */
    public ArrayStackDS(int[] arr, int n) {

    }

    /**
     * size method, will return the size of the backing array
     *
     * @return
     */
    public int size() {
        return n;//simply return the number of elements in the array
    }

    /**
     * add method, takes the index, as well as the item to add, calls resize if
     * the backing array is full
     *
     * @param i
     * @param numToAdd
     */
    public void add(int i, int numToAdd) {

        if (n + 1 > a.length) {
            resize();
        }

        for (int j = n; j > i; j--) {
            a[j] = a[j - 1];
        }
        a[i] = numToAdd;
        n++;
    }

    /**
     * get method, accepts the index as a parameter and returns the element at
     * index i
     *
     * @param i
     * @return
     */
    public int get(int i) {
        return a[i];//simply return a's value at index i
    }

    /**
     * set method, given an index and new value, simply get the old value (to be
     * returned at the end) and set the new value at index i
     *
     * @param i
     * @param newData
     * @return
     */
    public int set(int i, int newData) {

        int old = a[i];//get the old value
        a[i] = newData;//set the new value
        return old;//return the old value

    }

    /**
     * remove method to remove an element at an index, will shrink the size of
     * the array if enough elements are removed
     *
     * @param i
     * @return
     */
    public int remove(int i) {

        int oldVal = a[i];//get the value to be removed

        for (int j = i; j < n - 1; j++) {//loop through array, shifting elements over by one
            a[j] = a[j + 1];//shift happens here
        }
        n--;//decrement the total number of elements

        if (a.length >= 3 * n) {//if the total length is greater than or equal to 3 times the number of elements, then shrink the array
            resize();
        }

        return oldVal;//return the old value

    }

    /**
     * resize method, takes the max of n*2 or one (since if the array length is
     * 0 then 2*0 is 0
     */
    private void resize() {

        int[] tempArr = new int[max(n * 2, 1)];//take the max, either 2*

        for (int i = 0; i < n; i++) {
            tempArr[i] = a[i];
        }

        a = tempArr;
    }

    /**
     * max method, accepts two numbers as parameters and returns the larger of
     * the two used by resize
     *
     * @param num1
     * @param num2
     * @return
     */
    private int max(int num1, int num2) {

        if (num1 >= num2) {//if num1 is bigger than num2, then num1 is larger, return it
            return num1;
        } else {//otherwise num2 is bigger so return that instead
            return num2;
        }

    }
}
