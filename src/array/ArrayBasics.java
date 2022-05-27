package array;

public class ArrayBasics {

    public void arraySum() {

        int[] nums = new int[4];

        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 25;
        nums[3] = 5;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("[" + i + "] -> " + nums[i]);
        }

    }

    public void arrayAverage() {

        int[] nums = new int[4];

        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 25;
        nums[3] = 5;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("[" + i + "] -> " + nums[i]);
        }

    }
}

// print all elements --> print()
// array sum --> sum()
// array average --> average()
// maximum element --> maxElement()
// minimum element --> minElement()
// reverse the array --> reverse()
// search in an array --> search(int number)
// insert element at a given index --> insert(int index, int number) // 20 10 18 (7) 11 15 9 14
// sort --> sort()

// compare if 2 arrays are same or not? --> compare(int[] A1, int[] A2)

// zigzag --> zigzag() // 20 10 18 11 15 9 14 -> 10 20 15 18 11 14 9
