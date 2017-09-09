public class PrintTable {
    public static void main(String args[]) {
        System.out.println("a\ta^2\ta^3");
        int array[]={1,4,9,16};
        int array2[]={1,8,27,64};
        
        for (int counter=0;counter<array.length;counter++) {
            System.out.println((counter+1) + "\t" + array[counter] + "\t" + array2[counter]);
        }
    }
}
