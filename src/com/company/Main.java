package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 1.5));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double currentArea = width * height;
        double totalBucketsNeeded = (currentArea / areaPerBucket) - extraBuckets;
        return (int) (Math.ceil(totalBucketsNeeded));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double currentArea = width * height;
        return (int) Math.ceil(currentArea / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) (Math.ceil(area / areaPerBucket));
    }

    }
