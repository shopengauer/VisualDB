package com.vspavlov.visualdb.repository;

import com.vspavlov.visualdb.domain.Device;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Vasiliy on 13.07.2015.
 */
public interface DeviceRepository extends JpaRepository<Device,Long> {


}
