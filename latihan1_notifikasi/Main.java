public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new NotificationService(new EmailNotifier());
        emailService.notifyUser("Halo, ini email test!");

        NotificationService smsService = new NotificationService(new SMSNotifier());
        smsService.notifyUser("Ini SMS test!");

        NotificationService waService = new NotificationService(new WhatsAppNotifier());
        waService.notifyUser("Ini pesan WhatsApp test!");

        NotificationService telegramService = new NotificationService(new TelegramNotifier());
        telegramService.notifyUser("Ini pesan Telegram baru!");
    }
}
