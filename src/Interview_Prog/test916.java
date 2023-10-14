package Interview_Prog;


public class test916 {
    public static int findPartition(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        
        // Calculate the total sum of the array
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        
        // Iterate through the array and find the partition
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];  // Exclude the current element from the total sum
            
            if (leftSum == totalSum) {
                return arr[i];  // Found the partition element
            }
            
            leftSum += arr[i];  // Include the current element in the left sum
        }
        
        return -1;  // No partition element found
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 9, 0,4 , 10};
        int partition1 = findPartition(arr1);
        System.out.println("Partition element: " + partition1);
        
        int[] arr2 = {2, 3, 4, 1, 4, 5};
        int partition2 = findPartition(arr2);
        System.out.println("Partition element: " + partition2);
    }
}
