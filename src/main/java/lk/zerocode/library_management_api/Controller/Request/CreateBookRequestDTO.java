package lk.zerocode.library_management_api.Controller.Request;


import lombok.Data;

@Data
    public class CreateBookRequestDTO {
        private String title;
        private String author;
        private String isbn;
        private Integer publishedYear;
        private Long libraryUserId;
    }


