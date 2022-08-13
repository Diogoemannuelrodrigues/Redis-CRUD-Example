package br.com.poc.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("product")
@Builder
public class Product implements Serializable {

    @Id
    private Integer id;
    private String name;
    private String qtd;
    private Long price;


}
