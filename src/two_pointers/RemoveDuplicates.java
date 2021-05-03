package two_pointers;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,3,3,6,9,9};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int nextNotDuplicate = 1;
        int next = 1;
        while(next<arr.length) {
            if(arr[nextNotDuplicate - 1] != arr[next]) {
                arr[nextNotDuplicate] = arr[next];
                nextNotDuplicate++;
            }
            next++;
        }

        return nextNotDuplicate;
    }
}
