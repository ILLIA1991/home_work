package org.example_1.hw_37.Task_2;

// в названиях классов технические термины лучше не использовать. здесь и transaction и record - технические термины, а про
// суть класса ничего нет. предложу OrderItem
public record OrderItem(Integer id, Integer order_id, Integer product_id, Integer quantity) {
}
