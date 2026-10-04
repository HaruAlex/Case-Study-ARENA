package arena.entity;

/**
 * Biểu diễn banner/hình ảnh quảng cáo do Advertiser cung cấp để hiển thị
 * trong Tournament. Mỗi Advertisement gắn với một URL hình ảnh cụ thể.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class Advertisement {

    /** URL trỏ đến hình ảnh/banner quảng cáo. */
    private String imageUrl;

    /**
     * Khởi tạo Advertisement với đường dẫn hình ảnh cho trước.
     *
     * @param imageUrl URL của hình ảnh/banner quảng cáo, không được null
     */
    public Advertisement(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Trả về URL hình ảnh của banner quảng cáo.
     *
     * @return Chuỗi URL hình ảnh quảng cáo
     */
    public String getImageUrl() {
        return imageUrl;
    }
}
