package org.demo.solid;

public class OpenClosedPrincipleExample {


	public class SmtpMailer
	{
		//пример нарушения принципа открытости/закрытости – использование конкретных объектов без абстракций.
		//например, использование здесь класса Logger вместо интерфейса ILogger
		//привело бы к тому, что в случае, если бы потребовалось использовать иной класс — DatabaseLogger (запись в БД)
		//то нам бы пришлось изменять и SmtpMailer
		//однако по принципу единственности ответственности класс SmtpMailer не отвечает за логирование, то есть изменения не должны доходить до него
		//Но изменения дошли бы, если бы класс SmtpMailer не был закрыт для модификации
		private ILogger logger;

		public SmtpMailer(ILogger logger)
		{
			this.logger = logger;
		}

		public void SendMessage(String message)
		{
			// отсылка сообщения

			logger.Log("message");
		}
	}
	public interface ILogger
	{
		void Log(String logText);
	}

	public class Logger implements ILogger
	{
		public void Log(String logText)
		{
			// сохранить лог в файле
		}
	}

	public class DatabaseLogger implements ILogger
	{
		public void Log(String logText)
		{
			// сохранить лог в базе данных
		}
	}
}
