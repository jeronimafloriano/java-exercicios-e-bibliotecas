package hackerhanck.easy.abstractclass;

abstract class Book {

    String title;

    String getTitle(){
        return title;
    }

    abstract void setTitle(String title);
}
