public class TowerOfHanoi {
    public static void main(String[] args) {
        //below i have 4 'disks' as my numDisks
        //i can change it is id like but then i'd have to update my moveTower()
        int numDisks = 3;
        moveTowers(numDisks, 'A', 'C', 'B');

    }
    //'moveTowers' function is a recursive method that takes for parameter
    //'n': the # of disks to move
    //'char source' also known as 'A'
    //'char destination ' also known as ' C'
    //'char auxiliary' also known as 'B'
    public static void moveTowers(int n, char source, char destination, char auxiliary){
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        //recursive case, when there are more than one disk (n > 1),
        //the function follows the recursive algorithm for solving the Towers of Hanoi
        moveTowers(n-1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moveTowers(n-1, auxiliary , destination, source);
    }
}
