package com.portmaster.repository;

import com.portmaster.entity.PortStaticAttribute;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PortfolioRepository extends CrudRepository<PortStaticAttribute, Integer> {

/*    @Query("SELECT a, at FROM PortStaticAttribute a left JOIN PortEffAttribute at on a.port_Id = at.port_Id and  a.port_Id=:port_Id ")
    List<PortStaticAttribute> findByPortId(@Param("port_Id") String port_Id);

 */


    @Query("SELECT a FROM PortStaticAttribute a WHERE a.port_Id=:port_Id and a.port_status=:port_status")
    List<PortStaticAttribute> findByPortIdAndPortStatus(@Param("port_Id") String port_Id, @Param("port_status") int  port_status);

}
