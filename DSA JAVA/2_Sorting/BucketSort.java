//most of use in floating value
//there are specific range or specific condition base bucket
//sort that small small bucket and after joine them 

//  0.12,0.45,0.32,0.78,0.75,0.18,0.85,0.96,0.51,0.93

//    .18                     .78     .93
//    .12     .32 .45 .51     .75 .85 .96
// 0   1   2   3   4   5   6   7   8   9        //deivded into bucket after sort inner sort other algorithm

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    // in this array we made only 10 buckets and give partation base on first value
    static void sortBucket(float[] arr) {
        int n = arr.length;

        // create array of arraylists --> int buckets = new int[10] similler
        ArrayList<Float>[] buckets = new ArrayList[10];

        // create ematy arraylist of each buckets
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Add element into buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * 10;
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort each buckets individually
        for (int i = 0; i < 10; i++) {
            ArrayList<Float> bucket = buckets[i];
            Collections.sort(bucket);
        }

        // merge all bucket
        int index = 0;
        for (int i = 0; i < 10; i++) {
            ArrayList<Float> currBucket = buckets[i];
            for (int j = 0; j < currBucket.size(); j++) {
                arr[index++] = currBucket.get(j);
            }
        }

    }

    // in this array we made only n(arr.length) buckets and give partation base on
    // first value*arr.length
    static void sortBucket2(float[] arr) {
        int n = arr.length;

        // create array of arraylists --> int buckets = new int[10] similler
        ArrayList<Float>[] buckets = new ArrayList[n];

        // create ematy arraylist of each buckets
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Add element into buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * n;
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort each buckets individually
        for (int i = 0; i < 10; i++) {
            ArrayList<Float> bucket = buckets[i];
            Collections.sort(bucket); //use inbuiild collections method for sort
        }

        // merge all bucket
        int index = 0;
        for (int i = 0; i < buckets.length; i++) { // here buckets.length == arr.length
            ArrayList<Float> currBucket = buckets[i];
            for (int j = 0; j < currBucket.size(); j++) {
                arr[index++] = currBucket.get(j);
            }
        }

    }

    public static void main(String[] args) {
        float[] arr = { 0.12f, 0.45f, 0.32f, 0.78f, 0.75f, 0.18f, 0.85f, 0.96f, 0.51f, 0.93f };
        sortBucket2(arr);

        for (float e : arr) {
            System.out.print(e + " ");
        }
    }
}