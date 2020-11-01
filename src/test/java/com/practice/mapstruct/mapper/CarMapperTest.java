package com.practice.mapstruct.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.practice.mapstruct.dto.CarDto;
import com.practice.mapstruct.entity.Car;
import com.practice.mapstruct.entity.CarType;
import org.junit.jupiter.api.Test;

class CarMapperTest {
  @Test
  public void shouldMapCarToDto() {
    // given
    Car car = new Car("Morris", 5, CarType.SEDAN);

    // when
    CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

    // then
    assertNotNull(carDto);
    assertEquals(carDto.getMake(), "Morris");
    assertEquals(carDto.getSeatCount(), 5);
    assertEquals(carDto.getType(), "SEDAN");
  }
}
