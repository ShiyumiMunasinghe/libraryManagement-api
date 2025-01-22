package lk.zerocode.library_management_api.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class MembershipDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String membershipType;
    private String expiryDate;
    private Double membershipFee;
}
