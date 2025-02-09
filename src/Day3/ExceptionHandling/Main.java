package Day3.ExceptionHandling;

import java.util.Objects;

/* exception handling : error handling ketika ada operasi yang gagal
*  macam-macam error handling:
*  - IllegalArgumentException   : error handling untuk argumen/parameter yang dikirim/trima
*  - ArrayIndexOutOfBound       : error handling data entry
*  - IOException                : error handling untuk operasi file
*  - ArithmaticEception         : error handling operasi matematika
*  - ResourceNotFoundException  : error handling resource (404)
*  - BadRequestWxception        : error handling (400)
*  - UnauthorizedException      ; error handling (401)
*  - ForbiddenException         : error handling (403)
*  - InternalServerException    : error handling (500)
*  - Error: error handling universal*/

public class Main {
    static void  checkRole(String role){
        // equals untuk ngecek data yang dikirim dari parameter
        if (Objects.equals(role, "user")){
            // respon error manual
            throw new IllegalArgumentException("Access denied! only admin can access!");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        try {
            checkRole("user");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
