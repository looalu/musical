package config;

import com.example.musical.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public User user1() {
        User user1 = new User();
        user1.setUsername("aluazholdykan");
        user1.setEmail("alua.zholdykan@.narxoz.kz");
        user1.setPassword("thisisourproject123_");
        user1.setFullName("Alua Zholdykan");
        user1.setAddress("Almaty, Kazakhstan");
        user1.setPhoneNumber("+1234567890");
        return user1;
    }

    @Bean
    public User user2() {
        User user2 = new User();
        user2.setUsername("asylaiymerali");
        user2.setEmail("asylaium.erali@narxoz.kz");
        user2.setPassword("thisisourproject456_");
        user2.setFullName("Asylaiym Erali");
        user2.setAddress("Almaty,Kazakhstan");
        user2.setPhoneNumber("+9876543210");
        return user2;
    }

    @Bean
    public Product instrument() {
        Instrument instrument = new Instrument();
        instrument.setName("Electric Guitar");
        instrument.setPrice(150000);
        instrument.setDescription("High-quality electric guitar for professionals.");
        instrument.setImageUrl("https://example.com/guitar.jpg");
        instrument.setType("Electric");
        instrument.setBrand("Fender");
        instrument.setMaterial("Maple");
        return instrument;
    }

    @Bean
    public Product accessory() {
        Accessory accessory = new Accessory();
        accessory.setName("Guitar Strings");
        accessory.setPrice(4000);
        accessory.setDescription("Set of guitar strings for acoustic or electric guitars.");
        accessory.setImageUrl("https://example.com/strings.jpg");
        accessory.setCategory("Strings");
        accessory.setColor("Silver");
        return accessory;
    }

    @Bean
    public Order order() {
        Order order = new Order();
        order.setUser(user1());
        List<Product> products = new ArrayList<>(Arrays.asList(instrument(), accessory()));
        order.setProducts(products);
        order.setTotalPrice(154000);
        order.setPaymentMethod(PaymentMethod.CREDIT_CARD);
        order.setStatus(OrderStatus.PENDING);
        return order;
    }

}
