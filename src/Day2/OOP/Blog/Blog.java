package Day2.OOP.Blog;

/* enkapsulasi : cara untuk membatasi dan melindungi data/method dari access langsung untuk meningkatkan keamanan dari perubahan data yang tidak disengaja/sengaja */

import java.util.ArrayList;
import java.util.List;

public class Blog {
    // enkasulapsi
    private String title;
    private String content;

    /* List : interface yang nandain bahwa variable ini adalah sebuah list/daftar/array
    *  kenapa pakai list? biar bisa pakai ArrayList */
    private List<Comment> comments;

    public Blog(String blogTitle, String blogContent){
        title = blogTitle;
        content = blogContent;
        comments = new ArrayList<>();
    }

    // gatter blog
    public String getTitle(){return title;}
    public void setTitle(String newTitle){title = newTitle;}
    public String getContent(){return content;}
    public void setContent(String newContent){title = newContent;}

    // method blog
    public void displayInfo(){
        System.out.println("Title : "+ title);
        System.out.println("Content : "+ content);
    }


    // inner class : class di dalam class, object di dalam object
    public class Comment {
        private String author;
        private  String text;

        public Comment(String name, String comment){
            author = name;
            text = comment;
        }

        // gatter
        public String getAuthor(){return author;}
        public String getText(){return text;}
    }

    // method buat nambahin comment ke blog
    public void addComment(String author, String text){
        Comment newComment = new Comment(author, text);
        comments.add(newComment);
    }

    public void displayComments(){
        System.out.println("Comment : ");
        for (Comment comment : comments){
            //System.out.println("id : "+ (comment++));
            System.out.println("Author : "+ comment.getAuthor());
            System.out.println("text : "+ comment.getText());
        }
    }
}
