/* 
English

Java Abstract Class
A Java abstract class is a class that can't be instantiated, that means you cannot create
new instances of an abstract class. It works as a base for subclasses. You should learn about
Java Inheritence before attempting this challenge.
Following is an example of abstact class:
abstract class Book
{
    String title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return title;
    }
}
If you try to create an instance of this class like the following line you will get an error:
Book new_novel=new Book();
You have to create another class that extends the abstract class. Then you can create instance of the new class.
Notice that setTitle method is abstract too and has no body. That means you must implement the body of
the that method in the child class.
In the editor we have provided the abstract Book class and a Main class. In the Main class we created
instance of a class called MyBook. Your task is to write just the Mybook class. Your class mustn't be public.
Sample Input
A tale of two cities
Sample Output
The title is: A tale of two cities
*/

/*
VietNamese

Một lớp trừu tượng Java là một lớp không thể khởi tạo được. Điều đó có nghĩa là bạn không thể tạo các thực thể mới của một lớp trừu tượng. Nó hoạt động như một cơ sở cho các lớp con. Bạn nên tìm hiểu về Kế thừa Java trước khi thực hiện thử thách này.

Sau đây là một ví dụ về lớp trừu tượng:

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
Nếu bạn cố gắng tạo một thực thể của lớp này như dòng sau, bạn sẽ gặp lỗi:

Book new_novel=new Book(); 
Bạn phải tạo một lớp khác mở rộng lớp trừu tượng. Sau đó, bạn có thể tạo một thực thể của lớp mới.

Lưu ý rằng phương thức setTitle cũng trừu tượng và không có phần thân. Điều đó có nghĩa là bạn phải triển khai phần thân của phương thức đó trong lớp con.

Trong trình soạn thảo, chúng tôi đã cung cấp lớp Book trừu tượng và lớp Main. Trong lớp Main, chúng tôi đã tạo một thực thể của lớp có tên là MyBook. Nhiệm vụ của bạn là chỉ viết lớp MyBook.

Lớp của bạn không được công khai.

Input mẫu

A tale of two cities
Output mẫu

The title is: A tale of two cities
*/

import java.util.*;
abstract class Book
{
    String title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return title;
    }

}

//Write MyBook class here
class MyBook extends Book
{
    void setTitle(String s)
    {
        title = s;
    }

}

public class JavaAbstractClass {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
    }
}
