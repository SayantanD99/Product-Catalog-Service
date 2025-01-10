package in.codecraftsbysanta.productcatalogservice.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.codecraftsbysanta.productcatalogservice.dtos.ProductDTO;
import in.codecraftsbysanta.productcatalogservice.models.Product;
import in.codecraftsbysanta.productcatalogservice.services.IProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
public class ProductControllerMvcTest {

    @MockBean(name = "sps")
    private IProductService productService;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void Test_GetAllProducts_RunsSuccessfully() throws Exception {
        //Arrange
        Product product1 = new Product();
        product1.setName("Iphone12");
        product1.setId(1L);

        Product product2 = new Product();
        product2.setId(2L);
        product2.setName("Macbook");

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);

        when(productService.getAllProducts()).thenReturn(productList);

        ProductDTO productDto1 = new ProductDTO();
        productDto1.setName("Iphone12");
        productDto1.setId(1L);

        ProductDTO productDto2 = new ProductDTO();
        productDto2.setId(2L);
        productDto2.setName("Macbook");

        List<ProductDTO> productDtos = new ArrayList<>();
        productDtos.add(productDto1);
        productDtos.add(productDto2);

        mockMvc.perform(get("/products"))
                .andExpect(status().isOk())
                .andExpect(content().string(objectMapper.writeValueAsString(productDtos)));
    }
}