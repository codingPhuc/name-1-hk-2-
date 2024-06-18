# Hệ Điều Hành 
#khái_niệm
- là một chương trình hành sử trung gian giữa người sử dụng máy tính và phần cứng máy tính 
mục tiêu hệ điều hành :
- giúp cho việt sử dụng hệ thống máy tính dc dễ dàng hơn đối với mọi lứa tuổi
- thực thi chương trình của người giúp giải quyết vấn đề sử dụng máy tính của ng dùng dc dễ dàng hơn 
- làm cho phần mềm chạy một cách chân chu hiệu quả 
## công việt hệ diều hành 
- hệ diều hành tạo ra tiện ích cho người dùng ,đưa ra một hiệu năng tốt đẹp 
- sử dụng không quá phức tạp không quan tâm đến phần cứng hoạt động bên trong máy tính 
- đối với máy tính nhiều ng dùng vd máy chủ thì nó phải giúp mọi người làm việt công bằng và hiệu quả đáp ứng trong một thời gian như nhau 
- hdh nhu ng cấp phát tài nguyên quản lý việt thực thi trương trình 
- đối tượng quản chia sẽ tài nguyên trong các server ,workstation 
- trên thiết bị di động giúp ng dùng nhập và xuất ,tạo ra bàn phím ảo phương pháp nhập ngoài ra còn quản lý tác động đến tốc độ xử lý và nguồn pin tiêu thụ
- đối với máy như máy tính nhúng thì không cần tới giao diện ,chỉ dùng giao tiếp với máy nên chỉ cần tới tốc độ truyền nhận thông tin và hiệu năng xử lý 
- là một khái niệm rộng được xử dụng nhiều nơi như xe tăng, thuyền nên không có 1 định nghĩa chung 
## cấu trúc hệ diều hành 
![[Capture 1.png]]
chia ra làm 3 lớp trên là giao diện người dùng :
lớp trên [[giao diện dồ họa]] ,[[giao diện cảm ứng]],[[giao diện dòng lệnh]]
dưới là những chức năng thực hiện việt của hệ diều hành 
Hệ điều hành cung cấp một môi trường để thực thi các chương trình và dịch vụ cho các chương trình và người dùng
Một tập hợp các dịch vụ hệ điều hành cung cấp các chức năng hữu ích cho người dùng:
- Giao diện người dùng - Hầu hết tất cả các hệ điều hành đều có giao diện người dùng (UI).
    Thay đổi giữa Dòng lệnh (CLI), Giao diện Người dùng Đồ họa (GUI), màn hình cảm ứng, Hàng loạt
- Thực thi chương trình - Hệ thống phải có thể tải một chương trình vào bộ nhớ và để chạy chương trình đó, kết thúc thực thi, bình thường hoặc bất thường (chỉ ra lỗi)
- Hoạt động I / O - Một chương trình đang chạy có thể yêu cầu I / O, có thể liên quan đến tệp hoặc thiết bị I / O
- Thao tác với hệ thống tệp - Hệ thống tệp được quan tâm đặc biệt. Chương trình cần đọc và ghi tệp và thư mục, tạo và xóa chúng, tìm kiếm chúng, liệt kê thông tin tệp, quản lý quyền.

Một tập hợp các dịch vụ hệ điều hành cung cấp các chức năng hữu ích cho người dùng (Tiếp):
- Truyền thông( Communications) - Các quá trình có thể trao đổi thông tin, trên cùng một máy tính hoặc giữa các máy tính qua mạng:
   *Thông tin liên lạc có thể thông qua bộ nhớ dùng chung hoặc thông qua việc truyền tin nhắn (các gói được hệ điều hành di chuyển)
-  Phát hiện lỗi - Hệ điều hành cần liên tục nhận thức được các lỗi có thể xảy ra
    *Có thể xảy ra trong phần cứng CPU và bộ nhớ, trong thiết bị I / O, trong chương trình người dùng
     *Đối với mỗi loại lỗi, Hệ điều hành phải thực hiện hành động thích hợp để đảm bảo tính toán chính xác và nhất quán
     *Các phương tiện gỡ lỗi có thể nâng cao đáng kể khả năng của người dùng và lập trình viên để sử dụng hệ thống một cách hiệu quả
Một tập hợp các chức năng hệ điều hành khác tồn tại để đảm bảo hoạt động hiệu quả của chính hệ thống thông qua chia sẻ tài nguyên:
- Phân bổ tài nguyên - Khi nhiều người dùng hoặc nhiều công việc chạy đồng thời, tài nguyên phải được phân bổ cho từng người trong số họ
*Nhiều loại tài nguyên - chu kỳ CPU, bộ nhớ chính, lưu trữ tệp, thiết bị nhập / xuất.
- Ghi nhật ký(logging ) - Để theo dõi người dùng nào sử dụng bao nhiêu và loại tài nguyên máy tính nào
- Bảo vệ và bảo mật - Chủ sở hữu thông tin được lưu trữ trong hệ thống máy tính đa người dùng hoặc nối mạng có thể muốn kiểm soát việc sử dụng thông tin đó, các quá trình đồng thời không được can thiệp vào nhau
* Bảo vệ liên quan đến việc đảm bảo rằng tất cả quyền truy cập vào tài nguyên hệ thống đều được kiểm soát
* Bảo mật hệ thống khỏi người ngoài yêu cầu xác thực người dùng, mở rộng để bảo vệ các thiết bị I / O bên ngoài khỏi các nỗ lực truy cập không hợp lệ

