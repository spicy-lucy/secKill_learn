# ��ɱ/�߲���������������ʵ��

## ����ջ
SpringBoot, MySQL, Redis, RabbitMQ, MyBatis-Plus, Maven, Linux, JMeter

## ��������

### 1. �û�������ܼ���
- MD5(���� + ������) --> midPassword
- MD5(midPassword + ˽��) --> resultPassword
- ÿ���û��ж���˽�Σ��û���¼ʱ����˽��� `midPassword`������˽�μ��ܺ������ݿ�Աȡ�
- ��¼�ɹ������� UUID ��ϵ� `userTicket` ���� Redis��ͨ�� Cookie ����ǰ�ˡ�
- ʹ�� `UserArgumentResolver.java` ���β��е� `userTicket` ���� `user` ���󣬼���ÿ�δ� Redis ��ȡ�û�����Ĳ�����

### 2. ��Ӧ��Ϣö��
- ����ö�ٶ�����Ӧ��Ϣ��ͳһ����

### 3. �Զ���ע��У���ֻ���
- ʹ�� `IsMobile.java` ע��У���ֻ��š�

### 4. ȫ���쳣����
- ʵ��ȫ���쳣���쳣��������

### 5. JMeter ѹ��
- ���ú�ʹ�� JMeter �������ܲ��ԡ�

### 6. Redis ����
- ����ҳ������ݣ�������ʧЧʱ������޸Ľӿڴ����£���ֹ���ݲ�һ�¡�

### 7. ��������ͳ���
- ʹ�� MySQL Ĭ��������뼶��REPEATABLE-READ����ֹ�ظ�����ͳ�����
- �ڸ߲��������£�ʹ�� Redis Ԥ����棬���ٶ����ݿ��ѹ����

### 8. RabbitMQ ���ú�ʹ��
- ��װ������ RabbitMQ������ SpringBoot��ʹ�� fanout��direct��topic �� headers ��������

### 9. Redis Ԥ�����
- �� `SecKillController` ʵ�� `InitializingBean`����д `afterPropertiesSet()` �����������ݿ��ȡ��ɱ��Ʒ��棬���� Redis��ʵ��Ԥ����档

### 10. �ڴ����Ż��߲���
- �� `SecKillController` �ж��� `ConcurrentHashMap<Long, Boolean>`�������Ʒ���״̬���Ż��߲�������

### 11. RabbitMQ ��Ϣ�����첽����
- �������к� topic ���������Ż��û����飬���ٸ߲�������µ��̶߳ѻ���

### 12. ��ɱ�ӿڵ�ַ����
- ��̬������ɱ�ӿڵ�ַ����ֹ�ű��������û���¼������ `path`���洢�� Redis����ɱǰУ�� `path`��

### 13. ��֤��У��
- ���ɿ�Դ��֤����Ŀ `happyCaptcha`������ɱǰУ����֤�룬��ֹ������ɱ��

### 14. ��ɱ�ӿ�������ˢ
- �Զ��������� `AccessLimit.java` �� `AccessLimitInterceptor.java`��ͨ��ע�����ƽӿڷ���Ƶ�ʺʹ�������ֹˢ�ӿڡ�
- ʹ�� `ThreadLocal` �洢�û����󣬼��û���¼״̬�Ļ�ȡ��

### 15. Redis �ֲ�ʽ��
- ʹ�� Redis �ֲ�ʽ����ֹ��������� Lua �ű�ʵ�ָ���ҵ�񳡾��µ������ơ�
