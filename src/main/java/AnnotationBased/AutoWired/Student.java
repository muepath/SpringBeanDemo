package AnnotationBased.AutoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class Student {
    private Integer age;
    private String name;
    @Autowired
    private Optional<String> address;
    @Autowired(required=false)
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    @Autowired
    public void setName(@Nullable String name) {
        this.name = name;
    }

    public void  setAddress(Optional<String> address){
        this.address=address;
    }
    public String getName() {
        return name;
    }
}
