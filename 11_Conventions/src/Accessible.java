
//set to packaged private -- its default state
interface Accessible {
    int SOME_CONSTANT = 100; // visibility is set to public
    public void methodA(); // visibility is public
    void methodB();
    boolean methodC();
    //all interface methods are automatically public
}