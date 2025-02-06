package Day2.Interfaces;

public interface Role {
    default void admin(Boolean isAdmin){
        System.out.println("is admin : "+ isAdmin);
    }
}
