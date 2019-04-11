package org.jxnu.stu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jxnu.stu.dao.pojo.Shipping;
import org.jxnu.stu.dao.pojo.ShippingExample;

public interface ShippingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Sat Mar 30 17:46:04 CST 2019
     */
    long countByExample(ShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Sat Mar 30 17:46:04 CST 2019
     */
    int deleteByExample(ShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Sat Mar 30 17:46:04 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Sat Mar 30 17:46:04 CST 2019
     */
    int insert(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Sat Mar 30 17:46:04 CST 2019
     */
    int insertSelective(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Sat Mar 30 17:46:04 CST 2019
     */
    List<Shipping> selectByExample(ShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Sat Mar 30 17:46:04 CST 2019
     */
    Shipping selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Sat Mar 30 17:46:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") Shipping record, @Param("example") ShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Sat Mar 30 17:46:04 CST 2019
     */
    int updateByExample(@Param("record") Shipping record, @Param("example") ShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Sat Mar 30 17:46:04 CST 2019
     */
    int updateByPrimaryKeySelective(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Sat Mar 30 17:46:04 CST 2019
     */
    int updateByPrimaryKey(Shipping record);

    int delByUserIdShippingId(@Param("shippingId") Integer shippingId,@Param("userId") Integer userId);

    int updateByUserIdShippingIdSelective(Shipping shipping);

    Shipping selectByUserIdShippingId(@Param("shippingId") Integer shippingId,@Param("userId") Integer userId);

    List<Shipping> listAllByUserId(Integer userId);
}