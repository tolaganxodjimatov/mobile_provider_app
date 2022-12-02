package uz.tgsoft.task1.payload;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ClientDTO {
    private String fullName;
    private String password;
    private String pinfl;
    private Timestamp created_at;
    private Timestamp updated_at;
}






