package com.entity.vo;

import com.entity.PeixunEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 培训
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-25
 */
@TableName("peixun")
public class PeixunVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 培训名称
     */

    @TableField(value = "peixun_name")
    private String peixunName;


    /**
     * 培训开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "peixun_on_time")
    private Date peixunOnTime;


    /**
     * 培训结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "peixun_down_time")
    private Date peixunDownTime;


    /**
     * 培训类型
     */

    @TableField(value = "peixun_types")
    private Integer peixunTypes;


    /**
     * 培训内容
     */

    @TableField(value = "cultivate_content")
    private String cultivateContent;


    /**
     * 分数
     */

    @TableField(value = "peixun_fenshu")
    private Double peixunFenshu;


    /**
     * 培训评价
     */

    @TableField(value = "pingjia_content")
    private String pingjiaContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：培训名称
	 */
    public String getPeixunName() {
        return peixunName;
    }


    /**
	 * 获取：培训名称
	 */

    public void setPeixunName(String peixunName) {
        this.peixunName = peixunName;
    }
    /**
	 * 设置：培训开始时间
	 */
    public Date getPeixunOnTime() {
        return peixunOnTime;
    }


    /**
	 * 获取：培训开始时间
	 */

    public void setPeixunOnTime(Date peixunOnTime) {
        this.peixunOnTime = peixunOnTime;
    }
    /**
	 * 设置：培训结束时间
	 */
    public Date getPeixunDownTime() {
        return peixunDownTime;
    }


    /**
	 * 获取：培训结束时间
	 */

    public void setPeixunDownTime(Date peixunDownTime) {
        this.peixunDownTime = peixunDownTime;
    }
    /**
	 * 设置：培训类型
	 */
    public Integer getPeixunTypes() {
        return peixunTypes;
    }


    /**
	 * 获取：培训类型
	 */

    public void setPeixunTypes(Integer peixunTypes) {
        this.peixunTypes = peixunTypes;
    }
    /**
	 * 设置：培训内容
	 */
    public String getCultivateContent() {
        return cultivateContent;
    }


    /**
	 * 获取：培训内容
	 */

    public void setCultivateContent(String cultivateContent) {
        this.cultivateContent = cultivateContent;
    }
    /**
	 * 设置：分数
	 */
    public Double getPeixunFenshu() {
        return peixunFenshu;
    }


    /**
	 * 获取：分数
	 */

    public void setPeixunFenshu(Double peixunFenshu) {
        this.peixunFenshu = peixunFenshu;
    }
    /**
	 * 设置：培训评价
	 */
    public String getPingjiaContent() {
        return pingjiaContent;
    }


    /**
	 * 获取：培训评价
	 */

    public void setPingjiaContent(String pingjiaContent) {
        this.pingjiaContent = pingjiaContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
