package package1.controller;

public class Calculating {
    /**
     * param result  - Result
     */
    private float result;

    public boolean saveResult = false;


    /**
     * Method for get sqrt first & second argument
     */
    public void sqrt(){
        if (result != 0)
            result = (float)Math.sqrt(result);
    }

    /**
     * Method for get sqrt first & second argument
     * @param first - first argument number to pow
     * @param second - second argument number to be powed to
     */
    public void pow(int first, int second){
        if (second != 0)
            result = (float)Math.pow(first, second);
    }

    /**
     * Method for get sqrt first & second argument
     * @param first - first argument
     */
    public void sqrt(int first){
        if (first != 0)
            result = (float)Math.sqrt(first);
    }

    /**
     * Method for add first & second argument
     * @param first - first argument
     * @param second - second argument
     */
    public void add(int first, int second){

        result = first + second;
    }

    /**
     * Method for add result & second argument
     * @param second - second argument
     */
    public void add(int second){

        result +=second;
    }
    /**
     * Method for sub first & second argument
     * @param first - first argument
     * @param second - second argument
     */
    public void sub(int first,int second){

        result = first - second;
    }

    /**
     * Method for sub result & second argument
     * @param second - second argument
     */
    public void sub(int second){

        result -=second;
    }
    /**
     * Method for div first & second argument
     * @param first - first argument
     * @param second - second argument
     */
    public void div(int first, int second){
        if (second == 0) {
            result = -1;
            System.out.println("[ERROR] Division by Zero! Result forced to -1");
            return;
        }

        result = first / second;
    }
    /**
     * Method for div result & second argument
     * @param second - second argument
     */
    public void div(int second){

        result /=second;
    }
    /**
     * Method for mult first & second argument
     * @param first - first argument
     * @param second - second argument
     */
    public void mult(int first,int second){

        result = first * second;
    }
    /**
     * Method for mult result & second argument
     * @param second - second argument
     */
    public void mult(int second){

        result *=second;
    }

    /**
     * Method for return result
     * @return result
     */
    public float getResult(){

        return result;
    }

    /**
     * Method for return result
     * @return result
     */
    public float getResultAutoClean(){
        float number = result;
        this.result = 0;
        return number;
    }

    /**
     * Method for clear Result
     */
    public void clearResult(){
        this.result = 0;
    }

    /**
     * Method for save or clear result for next step
     * @param s - yes or no for  save or slear
     */
    public void setSaveResult(String s){
        if(s.equals("yes"))
            this.saveResult = true;
        else if(s.equals("no"))
            this.saveResult = false;
        else
            System.out.println("Invalid input");
    }

    /**
     * Method for input menu Calculator
     * */
    public void inputOperation(){
        System.out.println("1 - add");
        System.out.println("2 - sub");
        System.out.println("3 - div");
        System.out.println("4 - mult");
        System.out.println("5 - exit");
    }

}
