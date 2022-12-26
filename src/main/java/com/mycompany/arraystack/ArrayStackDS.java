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
        return n;
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
            //call resize here
        }

        for (int j = n; j > i; j--) {
            a[j] = a[j - 1];
        }
        a[i] = numToAdd;
        n++;
    }

    public int get(int i) {
        return a[i];
    }

}
