/*
    REQUIREMENTS:
        - To explain why the value "6" is printed twice
    ENTITY: 
        - PrePostDemo
    WORK TO BE DONE:
        - print the variable which is incremented and explain the flow
*/

class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"
    }
}

/*
    - In post incrementing, the copy of existing value is considered for the current step and then incremented by 1
    - In pre incrementing, 1 is added directly and then the step is executed.
    - For example,
            let, i = 5
            System.out.println(++i) --> Here the value i is incremented by 1 i.e. 6 and then the value is displayed
            System.out.println(i++) --> Here the i value is printed first and then the value of i is incremented
*/
