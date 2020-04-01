package legoset;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Minifig {
    @XmlAttribute
    private int count;

    @XmlValue
    private String name;

    public Minifig() {}

    public Minifig(int count, String name) {
        this.count = count;
        this.name = name;
    }
}
