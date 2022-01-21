package jsonex01;

import com.google.gson.Gson;

class SMSDto {
    private String groupId;
    private String successCount;
    private String errorCount;

    public SMSDto(String groupId, String successCount, String errorCount) {
        this.groupId = groupId;
        this.successCount = successCount;
        this.errorCount = errorCount;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(String successCount) {
        this.successCount = successCount;
    }

    public String getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(String errorCount) {
        this.errorCount = errorCount;
    }
}

public class GsonEx02 {
    public static void main(String[] args) {
        // {"group_id":"R2GdEONszq64lNB9","success_count":1,"error_count":0}
        SMSDto smsDto = new SMSDto("R2GdEONszq64lNB9", "1", "0");
        String smsReturn = "{\"groupId\":\"R2GdEONszq64lNB9\",\"successCount\":1,\"errorCount\":0}";
        Gson gson = new Gson();
        String jsonSMSDto = gson.toJson(smsDto);
        System.out.println(smsReturn);

        SMSDto javaUserDto = gson.fromJson(jsonSMSDto, SMSDto.class);
        System.out.println(javaUserDto.getGroupId());
        System.out.println(javaUserDto.getSuccessCount());
        System.out.println(javaUserDto.getErrorCount());
    }
}
