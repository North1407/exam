$(document).ready(function() {
    $("a[name='linkRemoveDetail']").each(function(index) {
        $(this).click(function() {
            removeDetailSectionByIndex(index);
        });
    });

});
const checkboxes = document.querySelectorAll('.checkbox');
checkboxes.forEach(function (checkbox) {
    checkbox.addEventListener('change', function () {
        // Lấy id của checkbox đang thay đổi
        const checkboxId = this.id;

        // Tạo id của input hidden tương ứng
        const hiddenInputId = `hidden-${checkboxId}`;

        // Tìm input hidden bằng id
        const hiddenInput = document.getElementById(hiddenInputId);

        if (this.checked) {
            // Nếu checkbox được chọn, xóa input hidden
            if (hiddenInput) {
                hiddenInput.remove();
            }
        } else {
            // Nếu checkbox bị bỏ chọn và input hidden không tồn tại, tạo nó và thêm vào DOM
            if (!hiddenInput) {
                const newHiddenInput = document.createElement('input');
                newHiddenInput.type = 'hidden';
                newHiddenInput.id = hiddenInputId;
                newHiddenInput.name = 'answerCorrects';
                newHiddenInput.value = '0';
                const parentDiv = this.parentElement;
                parentDiv.appendChild(newHiddenInput);
            }
        }
    });
});


function addNextAnswerSection() {
    allDivDetails = $("[id^='divDetail']");
    divDetailsCount = allDivDetails.length;

    htmlAnswerSection = `
        <div class="form-group row" 
        id="divDetail${divDetailsCount}">
            <input type="hidden" name="answerIDs" value="0"/>

            <label for="answer" class="col-sm-1 col-form-label">Answer:</label>
            <div class="col-sm-6">
                <input type="text" class="form-control" name="answerContents" maxlength="255" id="answer" required/>
            </div>

            <label class="col-sm-1 col-form-label">Correct:</label>
            <div class="col-sm-2">
                <input type="checkbox" class="form-control w-25 checkbox" name="answerCorrects" maxlength="255" value='1' id="${divDetailsCount}">
                <input type="hidden" id="hidden-${divDetailsCount}" name="answerCorrects" value='0'>
            </div>
            <div class="col-sm-1">
            <a class="btn fas fa-times-circle fa-2x icon-dark"
			href="javascript:removeDetailSectionById('divDetail${divDetailsCount}')"
			title="Remove this detail"></a>
        </div>
    `;

    $("#divQuestionAnswers").append(htmlAnswerSection);


    $("input[name='answerContents']").last().focus();

    // Đính kèm sự kiện change cho checkbox trong phần tử mới

    const newCheckbox = $("#divDetail" + divDetailsCount).find('.checkbox');
    newCheckbox.on('change', function () {
        const checkboxId = this.id;
        const hiddenInputId = `hidden-${checkboxId}`;
        const hiddenInput = document.getElementById(hiddenInputId);
        if (this.checked) {
            hiddenInput.remove();
        }
    });
}

function removeDetailSectionById(id) {
    $("#" + id).remove();
}

function removeDetailSectionByIndex(index) {
    $("#divDetail" + index).remove();
}
// Lấy tất cả các checkbox bằng class 'checkbox'
