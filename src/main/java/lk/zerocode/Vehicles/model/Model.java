package lk.zerocode.Vehicles.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="models")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String modelId;

    @ManyToOne
    private Type type;

    @OneToMany(mappedBy = "model")
    private List<Vehicle> vehicleList;

    @ManyToOne
    private Brand brand;


}
