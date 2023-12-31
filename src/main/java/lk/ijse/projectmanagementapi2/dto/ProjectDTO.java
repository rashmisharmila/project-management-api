package lk.ijse.projectmanagementapi2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO extends CustomDTO{
    private String proid;
    private String name;
    private String description;
    private Date startDate;
}
