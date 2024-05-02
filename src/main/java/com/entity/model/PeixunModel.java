package com.entity.model;

import com.entity.PeixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 培训
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-25
 */
public class PeixunModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 培训名称
     */
    private String peixunName;


    /**
     * 培训开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date peixunOnTime;


    /**
     * 培训结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date peixunDownTime;


    /**
     * 培训类型
     */
    private Integer peixunTypes;


    /**
     * 培训内容
     */
    private String cultivateContent;


    /**
     * 分数
     */
    private Double peixunFenshu;


    /**
     * 培训评价
     */
    private String pingjiaContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：培训名称
	 */
    public String getPeixunName() {
        return peixunName;
    }


    /**
	 * 设置：培训名称
	 */
    public void setPeixunName(String peixunName) {
        this.peixunName = peixunName;
    }
    /**
	 * 获取：培训开始时间
	 */
    public Date getPeixunOnTime() {
        return peixunOnTime;
    }


    /**
	 * 设置：培训开始时间
	 */
    public void setPeixunOnTime(Date peixunOnTime) {
        this.peixunOnTime = peixunOnTime;
    }
    /**
	 * 获取：培训结束时间
	 */
    public Date getPeixunDownTime() {
        return peixunDownTime;
    }


    /**
	 * 设置：培训结束时间
	 */
    public void setPeixunDownTime(Date peixunDownTime) {
        this.peixunDownTime = peixunDownTime;
    }
    /**
	 * 获取：培训类型
	 */
    public Integer getPeixunTypes() {
        return peixunTypes;
    }


    /**
	 * 设置：培训类型
	 */
    public void setPeixunTypes(Integer peixunTypes) {
        this.peixunTypes = peixunTypes;
    }
    /**
	 * 获取：培训内容
	 */
    public String getCultivateContent() {
        return cultivateContent;
    }


    /**
	 * 设置：培训内容
	 */
    public void setCultivateContent(String cultivateContent) {
        this.cultivateContent = cultivateContent;
    }
    /**
	 * 获取：分数
	 */
    public Double getPeixunFenshu() {
        return peixunFenshu;
    }


    /**
	 * 设置：分数
	 */
    public void setPeixunFenshu(Double peixunFenshu) {
        this.peixunFenshu = peixunFenshu;
    }
    /**
	 * 获取：培训评价
	 */
    public String getPingjiaContent() {
        return pingjiaContent;
    }


    /**
	 * 设置：培训评价
	 */
    public void setPingjiaContent(String pingjiaContent) {
        this.pingjiaContent = pingjiaContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
