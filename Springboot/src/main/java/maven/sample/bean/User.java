package maven.sample.bean;

import org.springframework.stereotype.Component;

@Component
public class User {

	private String kokyakucd;
	private String yusennjun;
	private String kokyakutel;
	private String kokyakutel_nys;
	private int revision;
	private String timestamp;
	private String updlogincd;
	/**
	 * @return kokyakucd
	 */
	public String getKokyakucd() {
		return kokyakucd;
	}
	/**
	 * @param kokyakucd セットする kokyakucd
	 */
	public void setKokyakucd(String kokyakucd) {
		this.kokyakucd = kokyakucd;
	}
	/**
	 * @return yusennjun
	 */
	public String getYusennjun() {
		return yusennjun;
	}
	/**
	 * @param yusennjun セットする yusennjun
	 */
	public void setYusennjun(String yusennjun) {
		this.yusennjun = yusennjun;
	}
	/**
	 * @return kokyakutel
	 */
	public String getKokyakutel() {
		return kokyakutel;
	}
	/**
	 * @param kokyakutel セットする kokyakutel
	 */
	public void setKokyakutel(String kokyakutel) {
		this.kokyakutel = kokyakutel;
	}
	/**
	 * @return kokyakutel_nys
	 */
	public String getKokyakutel_nys() {
		return kokyakutel_nys;
	}
	/**
	 * @param kokyakutel_nys セットする kokyakutel_nys
	 */
	public void setKokyakutel_nys(String kokyakutel_nys) {
		this.kokyakutel_nys = kokyakutel_nys;
	}
	/**
	 * @return revision
	 */
	public int getRevision() {
		return revision;
	}
	/**
	 * @param revision セットする revision
	 */
	public void setRevision(int revision) {
		this.revision = revision;
	}
	/**
	 * @return timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp セットする timestamp
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return updlogincd
	 */
	public String getUpdlogincd() {
		return updlogincd;
	}
	/**
	 * @param updlogincd セットする updlogincd
	 */
	public void setUpdlogincd(String updlogincd) {
		this.updlogincd = updlogincd;
	}
}
