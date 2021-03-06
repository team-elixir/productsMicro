package com.productmicro.micro.Repositories;

import com.productmicro.micro.Entities.ImageUrl;
import com.productmicro.micro.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ImageUrlRepo extends JpaRepository<ImageUrl, Integer> {
    @Transactional
        //research more
//    void deleteImageUrlsById(int productId);

    void deleteImageUrlsByProductId(int pid);

 //   @Query("SELECT  u.imageName from ImageUrl  u where u.product =?1")
    //List<ImageUrl> findImageUrlsByProductId(int productId); //




    //@Query("SELECT u.imageName from ImageUrl u where u.product=?1")
    List <ImageUrl> findImageUrlsByProductId(int pid); //hereProduct Id is the primary key id field of the product entity

 ///  List <ImageUrl> findByProduct(int pid);

}
