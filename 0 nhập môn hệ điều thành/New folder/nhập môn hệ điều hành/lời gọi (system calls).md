# system calls 
#khái_niệm
khi chúng ta nói về một cái rất  là quan trọng đó là các lời gọi hệ thống Chúng ta có một bên là cung cấp dịch vụ và một bên sử dụng dịch vụ cái gì hai bên này phải có một kết nối chung chính là các lời gọi các cách thức để cho bên này thực hiện yêu cầu và để cho bên kia biết rằng bên này đang yêu cầu cái gì để đáp ứng
- trong hệ điều hành thì những lời gọi hệ thống này chính là cách giao diện lập trình để cho các dịch vụ có thể được sử dụng bởi chương trình
- thường được viết bằng những ngôn ngữ cấp cao như C/C++
- Thường dc sử dụng với api
có một cái lời gọi hệ thống thì chỉ là một câu gọi nhưng bên dưới nó có thể sẽ rất nhiều chi tiết  lấy ví dụ là cái lời cái lệnh Sao Chép tinh cái này đến nơi khác cái gì trong linus chúng ta sử dụng định MV chúng ta copy sao chép từ nơi này sang nơi khác trong tập tin 
 ![[Capture 2.png]]
 khi thực hiện lời gọi thì ta cần :
 ![[Pasted image 20220219111116.png]]
 1. nhất là sẽ có ghi tên hàm tên lời  gọi 
 2. hai  là sẽ có những cái giá trị truyền vào thiết lập cái lệnh đó 
 3. thứ ba một giá trị trả về Để chúng ta biết là kết quả thực thi lời gọi đó như sao 
## system call implementation
- thường một con số được giao cho các lời gọi như id 
*giao diện sẽ duy trùy một cái bản chỉ mục để quản lý id con số 
- dc gọi hệ thống báo cho nhân thực thi lời gọi trả về kết quả 
*người dùng không cần biết dến chi tiết bên dưới chỉ cần biết lời gọi nên thực hiện công việt gì 
![[Capture 4.png]]
1. người dùng gọi 1 câu lệnh thực thi 
2. nhân [[hdh]] sẽ tra coi nó là câu lệnh với mã nào
3. trả về chương trình thực hiện câu lệnh đó 
4. người dùng nhận dc kết quả 
## điều kiện thực hiện lời gọi : 
ta phải truyền một tham số nếu đơn giản là một số nguyên con loại phức tạp thường là mảng hoặc khối giữ liệu 
- trong trường hợp truyền vào phức tạp thì ta phải truyền địa trỉ hay là dùng con trỏ 
- một số hệ điều hành còn dùng phương pháp  là đặt cách hàm số đó bằng trong một cái stack và sẽ lấy ra khi mà xử lý cái lời gọi đó, phương pháp phối stack thì không giới hạn kích thước  của cái số lượng tham số
- ![[Capture 5.png]]
x là địa chỉ dc chuyền vào trong thanh ghi khi muốn thực hiện lời gọi thì hệ thống sẽ lấy địa chỉ x và chạy đến cái địa chỉ đó để lấy tham số mà hệ thống cần 
## các loại lời gọi 
xử lý tiến trình :
- tạo tiến trình, kết thúc tiến trình
- kết thúc  tiến trình, hủy  tiến trình 
- nạp  tiến trình, thực thi  tiến trình
- lấy thông tin  tiến trình , đặt thuộc tính quy trình
- đợi  tiến trình
- lấy thông tin  tiến trình
-  giải phóng bộ nhớ
- bản chụp bộ nhớ nếu  chương trình có nếu lỗi
- Trình gỡ lỗi nếu tìm thấy  lỗi, thực hiện  chương trình từng bước  
- Khóa tiến trình trong việt đồng bộ chúng với nhau 
Quản lý tệp: 
- tạo tệp, xóa tệp
- mở, đóng tệp
- đọc, viết, đặt lại vị trí tệp
- lấy  thuộc tính tập tin
Quản lý thiết bị: 
- yêu cầu thiết bị, giải phóng thiết bị
- đọc, viết, đặt lại vị trí
- lấy thuộc tính thiết bị, đặt thuộc tính thiết bị
- gắn hoặc tách thiết bị ra hệ thống 
Bảo trì thông tin: 
- lấy thời gian hoặc ngày tháng, đặt thời gian hoặc ngày tháng
- lấy dữ liệu hệ thống, thiết lập dữ liệu hệ thống
- lấy và đặt các thuộc tính quy trình, tệp hoặc thiết bị
Thông tin liên lạc :
- tạo, xóa kết nối giao tiếp
- gửi, nhận tin nhắn nếu thông báo chuyển mô hình đến tên máy chủ hoặc tên quá trình
         *Từ máy khách đến máy chủ: 
-    Shared-memory model tạo và lấy quyền truy cập vào các vùng bộ nhớ
- chuyển thông tin trạng thái
- gắn và tháo các thiết bị từ xa
 Sự bảo vệ: 
- Kiểm soát quyền truy cập vào tài nguyên
- Nhận và đặt quyền
- Cho phép và từ chối quyền truy cập của người dùng
Sự bảo vệ
- Kiểm soát quyền truy cập vào tài nguyên
- Nhận và đặt quyền premission
- Cho phép và từ chối quyền truy cập của người dùng