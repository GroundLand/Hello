package importJAVASE.Enum;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.io.File;
import java.io.IOException;

/**
 * @author cl
 * function:
 * Created on  2020-03-24 15:01
 */

@Data
public class Pizza {
    private PizzaStatus status;

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    public enum PizzaStatus {
        ORDERED (5){
            @Override
            public boolean isOrdered() {
                return true;
            }
        },
        READY (2){
            @Override
            public boolean isReady() {
                return true;
            }
        },
        DELIVERED (0){
            @Override
            public boolean isDelivered() {
                return true;
            }
        };

        private int timeToDelivery;

        public boolean isOrdered() {return false;}

        public boolean isReady() {return false;}

        public boolean isDelivered(){return false;}

        public int getTimeToDelivery() {
            return timeToDelivery;
        }

        PizzaStatus (int timeToDelivery) {
            this.timeToDelivery = timeToDelivery;
        }
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }

    public PizzaStatus getStatus() {
        return status;
    }

    public boolean isDeliverable() {
        return this.status.isDelivered();
    }

    public void printTimeToDeliver() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("target/car.json"), this.getStatus());
        System.out.println("Time to delivery is " +
                this.getStatus().getTimeToDelivery());
    }
}
