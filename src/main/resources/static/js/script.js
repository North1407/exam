document.addEventListener('DOMContentLoaded', function() {
    // Lấy các phần tử cần sử dụng
    var filterDropdown = document.getElementById('filter');
    var dataTable = document.getElementById('dataTable');
    var tableRows = dataTable.getElementsByTagName('tbody')[0].getElementsByTagName('tr');

    // Xử lý sự kiện khi dropdown thay đổi
    filterDropdown.addEventListener('change', function() {
        var selectedValue = filterDropdown.value;

        // Lặp qua các dòng của bảng và ẩn/hiện dựa trên giá trị được chọn
        for (var i = 0; i < tableRows.length; i++) {
            var row = tableRows[i];
            var cell = row.getElementsByTagName('td')[2]; // Chỉnh số index dựa trên cột cần lọc

            if (selectedValue === 'all' || cell.textContent === selectedValue) {
                row.style.display = ''; // Hiện dòng
            } else {
                row.style.display = 'none'; // Ẩn dòng
            }
        }
    });
});
