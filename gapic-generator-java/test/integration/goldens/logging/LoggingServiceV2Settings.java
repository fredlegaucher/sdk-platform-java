/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.logging.v2;

import static com.google.logging.v2.LoggingServiceV2Client.ListLogEntriesPagedResponse;
import static com.google.logging.v2.LoggingServiceV2Client.ListLogsPagedResponse;
import static com.google.logging.v2.LoggingServiceV2Client.ListMonitoredResourceDescriptorsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.logging.v2.stub.LoggingServiceV2StubSettings;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link LoggingServiceV2Client}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (logging.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of deleteLog to 30 seconds:
 *
 * <pre>{@code
 * LoggingServiceV2Settings.Builder loggingServiceV2SettingsBuilder =
 *     LoggingServiceV2Settings.newBuilder();
 * loggingServiceV2SettingsBuilder
 *     .deleteLogSettings()
 *     .setRetrySettings(
 *         loggingServiceV2SettingsBuilder
 *             .deleteLogSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * LoggingServiceV2Settings loggingServiceV2Settings = loggingServiceV2SettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class LoggingServiceV2Settings extends ClientSettings<LoggingServiceV2Settings> {

  /** Returns the object with the settings used for calls to deleteLog. */
  public UnaryCallSettings<DeleteLogRequest, Empty> deleteLogSettings() {
    return ((LoggingServiceV2StubSettings) getStubSettings()).deleteLogSettings();
  }

  /** Returns the object with the settings used for calls to writeLogEntries. */
  public UnaryCallSettings<WriteLogEntriesRequest, WriteLogEntriesResponse>
      writeLogEntriesSettings() {
    return ((LoggingServiceV2StubSettings) getStubSettings()).writeLogEntriesSettings();
  }

  /** Returns the object with the settings used for calls to listLogEntries. */
  public PagedCallSettings<
          ListLogEntriesRequest, ListLogEntriesResponse, ListLogEntriesPagedResponse>
      listLogEntriesSettings() {
    return ((LoggingServiceV2StubSettings) getStubSettings()).listLogEntriesSettings();
  }

  /** Returns the object with the settings used for calls to listMonitoredResourceDescriptors. */
  public PagedCallSettings<
          ListMonitoredResourceDescriptorsRequest,
          ListMonitoredResourceDescriptorsResponse,
          ListMonitoredResourceDescriptorsPagedResponse>
      listMonitoredResourceDescriptorsSettings() {
    return ((LoggingServiceV2StubSettings) getStubSettings())
        .listMonitoredResourceDescriptorsSettings();
  }

  /** Returns the object with the settings used for calls to listLogs. */
  public PagedCallSettings<ListLogsRequest, ListLogsResponse, ListLogsPagedResponse>
      listLogsSettings() {
    return ((LoggingServiceV2StubSettings) getStubSettings()).listLogsSettings();
  }

  public static final LoggingServiceV2Settings create(LoggingServiceV2StubSettings stub)
      throws IOException {
    return new LoggingServiceV2Settings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return LoggingServiceV2StubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return LoggingServiceV2StubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return LoggingServiceV2StubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return LoggingServiceV2StubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return LoggingServiceV2StubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return LoggingServiceV2StubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return LoggingServiceV2StubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected LoggingServiceV2Settings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for LoggingServiceV2Settings. */
  public static class Builder extends ClientSettings.Builder<LoggingServiceV2Settings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(LoggingServiceV2StubSettings.newBuilder(clientContext));
    }

    protected Builder(LoggingServiceV2Settings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(LoggingServiceV2StubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(LoggingServiceV2StubSettings.newBuilder());
    }

    public LoggingServiceV2StubSettings.Builder getStubSettingsBuilder() {
      return ((LoggingServiceV2StubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to deleteLog. */
    public UnaryCallSettings.Builder<DeleteLogRequest, Empty> deleteLogSettings() {
      return getStubSettingsBuilder().deleteLogSettings();
    }

    /** Returns the builder for the settings used for calls to writeLogEntries. */
    public UnaryCallSettings.Builder<WriteLogEntriesRequest, WriteLogEntriesResponse>
        writeLogEntriesSettings() {
      return getStubSettingsBuilder().writeLogEntriesSettings();
    }

    /** Returns the builder for the settings used for calls to listLogEntries. */
    public PagedCallSettings.Builder<
            ListLogEntriesRequest, ListLogEntriesResponse, ListLogEntriesPagedResponse>
        listLogEntriesSettings() {
      return getStubSettingsBuilder().listLogEntriesSettings();
    }

    /** Returns the builder for the settings used for calls to listMonitoredResourceDescriptors. */
    public PagedCallSettings.Builder<
            ListMonitoredResourceDescriptorsRequest,
            ListMonitoredResourceDescriptorsResponse,
            ListMonitoredResourceDescriptorsPagedResponse>
        listMonitoredResourceDescriptorsSettings() {
      return getStubSettingsBuilder().listMonitoredResourceDescriptorsSettings();
    }

    /** Returns the builder for the settings used for calls to listLogs. */
    public PagedCallSettings.Builder<ListLogsRequest, ListLogsResponse, ListLogsPagedResponse>
        listLogsSettings() {
      return getStubSettingsBuilder().listLogsSettings();
    }

    @Override
    public LoggingServiceV2Settings build() throws IOException {
      return new LoggingServiceV2Settings(this);
    }
  }
}
