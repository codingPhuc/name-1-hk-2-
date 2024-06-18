# tổ trức hệ thống máy tính 
- gồm có một hay nhiều cpu ,các thiết bị điều khiển thì sẽ dc kết nối thông qua một đường bus truy cập qua một bộ nhớ chung 
- việt thi thành dồng thời cpu và thiết bị cần một chu kỳ bộ nhớ nào đó 

memory là nơi trung gian để chia sẽ giữ liệu 
- Các thiết bị I / O và CPU có thể thực thi đồng thời

- Mỗi bộ điều khiển thiết bị phụ trách một loại thiết bị cụ thể

- Mỗi bộ điều khiển thiết bị có một bộ đệm cục bộ([[buffer]])

- Mỗi loại bộ điều khiển thiết bị có một trình điều khiển thiết bị hệ điều hành để
quản lý nó

- CPU di chuyển dữ liệu từ / đến bộ nhớ chính đến / từ bộ đệm cục bộ

- I / O từ thiết bị đến bộ đệm cục bộ của bộ điều khiển

- Bộ điều khiển thiết bị thông báo cho CPU biết rằng nó đã kết thúc hoạt động bằng cách [[ngắt]]
một [[hdh]] hoạt dộng giựa trên tính hiệu [[ngắt]] và [[ngoại lệ]] 
![[Capture1.png]]