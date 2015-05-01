package com.cking.phss.dto.sfgl.jsb;

import java.util.List;

import com.cking.phss.bean.BeanCD;
import com.cking.phss.bean.InspectAuxiliary;
import com.cking.phss.dto.IDto;
import com.cking.phss.dto.innner.DeviceUse;
import com.cking.phss.dto.innner.MedicineUse;
import com.cking.phss.global.Global;
import com.cking.phss.util.DeviceUseFactory;
import com.cking.phss.xml.util.XmlAttribute;
import com.cking.phss.xml.util.XmlTag;

/**
 * HFM03 保存精神病随访记录.xml
 * 
 * @author Administrator
 */
public class BcjsbsfjlHfm03 implements IDto {
	/**
	 * Request
	 */
	@XmlTag(name = "Request")
	public Request request = null;

	static public class Request implements IDto {
		@XmlAttribute(name = "OrgCode")
		public String orgCode = Global.orgCode;

		@XmlAttribute(name = "OperType")
		public String operType = "HFM03";

		// 存盘类型，1：新增存盘 2：编辑存盘
		@XmlTag(name = "Type")
		public int type = 0;

		// 操作用户ID
		@XmlTag(name = "UserID")
		public String userID = "";

		// 个人档案号
		@XmlTag(name = "ResidentID")
		public String residentID = "";

		//--个人姓名--
		@XmlTag(name = "ResidentName")
		public String residentName = "";

		// <!-- 随访编号 -->
		@XmlTag(name = "FlupID")
		public String flupID = "";

		// <!-- 证件类型ID-->
		@XmlTag(name = "Credentials")
		public BeanCD Credentials = null;

		// <!-- 证件号 -->
		@XmlTag(name = "CredentialsNo")
		public String CredentialsNo = null;

		// <!-- 危险性级别, CD：代码 ，1.0级、2.1级、3.2级、4.3级、5.4级、6.5级-->
		@XmlTag(name = "Dangerous")
		public BeanCD Dangerous = null;

		// <!-- 目前症状, CD：代码
		// ；1.幻觉、2.交流困难、3.猜疑、4.喜怒无常、5.行为怪异、6.兴奋话多、7.伤人毁物、8.悲观厌世、9.无故外走、10.自语自笑、11.孤僻懒散、99.其他-->
		@XmlTag(name = "Symptoms")
		public BeanCD Symptoms = null;
		// <!-- 自知力, CD：代码 ；1.自知力完全、2.自知力不全、3.自知力缺失-->
		@XmlTag(name = "Insight")
		public BeanCD Insight = null;
		// <!-- 睡眠情况, CD：代码 ；1.良好、2.一般、3.较差-->
		@XmlTag(name = "Sleeping")
		public BeanCD Sleeping = null;
		// <!-- 饮食情况, CD：代码 ；1.良好、2.一般、3.较差-->
		@XmlTag(name = "Diet")
		public BeanCD Diet = null;
		// <!-- 个人生活料理, CD：代码 ；1.良好、2.一般、3.较差-->
		@XmlTag(name = "LifeCare")
		public BeanCD LifeCare = null;
		// <!-- 家务劳动, CD：代码 ；1.良好、2.一般、3.较差-->
		@XmlTag(name = "Housework")
		public BeanCD Housework = null;
		// <!-- 生产劳动及工作, CD：代码 ；1.良好、2.一般、3.较差、9.此项不适用-->
		@XmlTag(name = "ProductiveLabor")
		public BeanCD ProductiveLabor = null;
		// <!-- 学习能力, CD：代码 ；1.良好、2.一般、3.较差-->
		@XmlTag(name = "LearningAbility")
		public BeanCD LearningAbility = null;
		// <!-- 社会人际交往, CD：代码 ；1.良好、2.一般、3.较差-->
		@XmlTag(name = "Communication")
		public BeanCD Communication = null;
		// <!-- 有无对家庭社会的影响, CD：代码 ；1.无，2.有-->
		@XmlTag(name = "Influence")
		public BeanCD Influence = null;
		// <!-- 对家庭社会的影响 - 轻度滋事次数 -->
		@XmlTag(name = "MildTrouble")
		public String MildTrouble = "";
		// <!-- 对家庭社会的影响 - 肇事次数 -->
		@XmlTag(name = "Accident")
		public String Accident = "";
		// <!-- 对家庭社会的影响 - 肇祸次数 -->
		@XmlTag(name = "Trouble")
		public String Trouble = "";
		// <!-- 对家庭社会的影响 - 自伤次数 -->
		@XmlTag(name = "SelfWounding")
		public String SelfWounding = "";
		// <!-- 对家庭社会的影响 - 自杀未遂次数 -->
		@XmlTag(name = "AttemptedSuicide")
		public String AttemptedSuicide = "";
		// <!-- 对家庭社会的影响 - 其他 -->
		@XmlTag(name = "InfluenceOther")
		public String InfluenceOther = "";
		// <!-- 关锁情况, CD：代码 ；1.无关锁、2.关锁、3.关锁已解除-->
		@XmlTag(name = "LockUp")
		public BeanCD LockUp = null;
		// <!-- 住院情况, CD：代码 ；1.从未住院；2.目前正在住院；3.既往住院，4.现未住院-->
		@XmlTag(name = "Hospitalizations")
		public BeanCD Hospitalizations = null;
		// <!-- 末次出院时间 -->
		@XmlTag(name = "LastDischargeDate")
		public String LastDischargeDate = "";
		// <!-- 实验室检查有无, CD：代码 ；1.无，2.有-->
		@XmlTag(name = "LaboratoryTest")
		public BeanCD LaboratoryTest = null;
		//<!-- 实验室（辅助）检查，有多条数据，因此会有多个InspectAuxiliary节点 -->
		@XmlTag(name = "InspectAuxiliary", isListWithoutGroupTag=true)
		public List<InspectAuxiliary> inspectAuxiliaries = null;
		// <!-- 服药依从性, CD：代码 ；1.规律、2.间断、3.不服药-->
		@XmlTag(name = "DrugCompliance")
		public BeanCD DrugCompliance = null;
		// <!-- 药物不良反应有无, CD：代码 ；1.无，2.有-->
		@XmlTag(name = "AdverseReactions")
		public BeanCD AdverseReactions = null;
		//<!--有多条用药情况记录，因此会有多个MedicineUse节点 -->
		@XmlTag(name = "MedicineUse", isListWithoutGroupTag=true)
		public List<MedicineUse> medicineUses = null;
		// <!-- 治疗效果, CD：代码 ；1.痊愈、2.好转、3.无变化、4.加重-->
		@XmlTag(name = "TreatmentEffect")
		public BeanCD TreatmentEffect = null;
		// <!-- 康复措施, CD：代码 ；1.生活劳动能力、2.职业训练、3.学习能力、4.社会交往、99.其他-->
		@XmlTag(name = "RehabilitationMeasure")
		public BeanCD RehabilitationMeasure = null;
		// <!-- 本次随访分类, CD：代码 ；1.不稳定、2.基本稳定、3.稳定、0.未访到-->
		@XmlTag(name = "Conclusion")
		public BeanCD Conclusion = null;
		// <!-- 随访日期 -->
		@XmlTag(name = "FlupDate")
		public String FlupDate = "";
		// <!-- 下次随访日期 -->
		@XmlTag(name = "NextFlupDate")
		public String NextFlupDate = "";
		// <!-- 责任医生ID -->
		@XmlTag(name = "DutyDoctorID")
		public String DutyDoctorID = "";
		// <!-- 责任医生姓名 -->
		@XmlTag(name = "DutyDoctorName")
		public String DutyDoctorName = "";
		// <!-- 转诊标志 -->
		@XmlTag(name = "TransferFlag")
		public String TransferFlag = "";
		// <!-- 转诊原因 -->
		@XmlTag(name = "TransferReason")
		public String TransferReason = "";
		// <!-- 转入医疗机构名称 -->
		@XmlTag(name = "TransferInstitution")
		public String TransferInstitution = "";
		// <!-- 转入机构科室名称 -->
		@XmlTag(name = "TransferDepartment")
		public String TransferDepartment = "";

		//<!-- 数据来源, 有多条记录，因此会有多个DeviceUse节点-->
		@XmlTag(name = "DeviceUse", isListWithoutGroupTag=true)
		public List<DeviceUse> deviceUses = DeviceUseFactory.getDtoDeviceUses(getClass());
	}

	/**
	 * Response
	 * 
	 * @author Administrator
	 */
	@XmlTag(name = "Response")
	public Response response = null;

	static public class Response implements IDto {
		@XmlAttribute(name = "ErrMsg")
		public String errMsg = "";

		@XmlTag(name = "ResidentID")
		public String residentID = "";

		@XmlTag(name = "FlupID")
		public int flupID = 0;
	}

	public void init() {
		// /**
		// * Request
		// */
		// this.request = new Request();
		// this.request.orgCode = "16";
		// this.request.operType = "16";
		// this.request.type = 1;
		// this.request.userID = 16;
		// this.request.residentID = "16";
		// this.request.flupID = "16";
		// this.request.visitDate = "2012-10-03";
		// this.request.doctorID = "1016";
		// this.request.doctorName = "安哥";
		// this.request.sffscd = 1016;
		// this.request.xcsf = "2012-10-12";
		// this.request.ZZCD = "1";
		// this.request.ZZQT = "无异常";
		// this.request.SBP = 0;
		// this.request.DBP = 12;
		// this.request.BCTZ = "61.5";
		// this.request.BCSG = "171";
		// this.request.TZZS = "体质正常";
		// this.request.BCXL = 68;
		// this.request.QTTZ = "其他特征正常";
		// this.request.XCTZ = "60";
		// this.request.XCXL = 75;
		// this.request.BCXYL = 03;
		// this.request.XCXY = 04;
		// this.request.BCYJ = 03;
		// this.request.XCYJ = 04;
		// this.request.YDZC = 11;
		// this.request.XCYDZC = 19;
		// this.request.XCYDCD = 30;
		// this.request.BCSYL = 1;
		// this.request.XCSYL = 2;
		// this.request.XLTZCD = 1;
		// this.request.ZYXWCD = 1;
		// this.request.FZJC = "1";
		// this.request.FYYCXCD = 2;
		// this.request.BLFY = 0;
		// this.request.FYQK = "没有不良情况";
		// this.request.SFFLCD = 1;
		// this.request.ZZYY = "该医院设备不全";
		// this.request.ZZKB = "什么什么设备";
		// this.request.BZ = "无备注";
		// /**
		// * Response
		// */
		// this.response = new Response();
		// this.response.errMsg = "16";
		// this.response.residentID = "1016";
		// this.response.visitID = 1106;
	}
}